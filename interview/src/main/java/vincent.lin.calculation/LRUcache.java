package vincent.lin.calculation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * An LRU cache, based on <code>LinkedHashMap</code>.
 *
 * <p>
 * This cache has a fixed maximum number of elements (<code>cacheSize</code>).
 * If the cache is full and another entry is added, the LRU (least recently used) entry is dropped.
 *
 * <p>
 * This class is thread-safe. All methods of this class are synchronized.
 *
 * <p>
 * Author: Christian d'Heureuse, Inventec Informatik AG, Zurich, Switzerland<br>
 * Multi-licensed: EPL / LGPL / GPL / AL / BSD.
 *//**
 * An LRU cache, based on <code>LinkedHashMap</code>.
 *
 * <p>
 * This cache has a fixed maximum number of elements (<code>cacheSize</code>).
 * If the cache is full and another entry is added, the LRU (least recently used) entry is dropped.
 *
 * <p>
 * This class is thread-safe. All methods of this class are synchronized.
 *
 * <p>
 * Author: Christian d'Heureuse, Inventec Informatik AG, Zurich, Switzerland<br>
 * Multi-licensed: EPL / LGPL / GPL / AL / BSD.
 */
public class LRUcache<K, V> {
    private static final float hashTableLoadFactor = 0.75f;
    private int cachesize;
    private LinkedHashMap<K, V> map;
    /**
     * Creates a new LRU cache.
     * @param cacheSize the maximum number of entries that will be kept in this cache.
     */
    public LRUcache(int cacheSize) {
        this.cachesize = cacheSize;
        int hashTableCapacity = (int) Math.ceil(cacheSize / hashTableLoadFactor) + 1;
        map = new LinkedHashMap(cacheSize, hashTableCapacity, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > LRUcache.this.cachesize;
            }
        };
    }

    /**
     * Retrieves an entry from the cache.<br>
     * The retrieved entry becomes the MRU (most recently used) entry.
     * @param key the key whose associated value is to be returned.
     * @return    the value associated to this key, or null if no value with this key exists in the cache.
     */
    public synchronized V get(K key) {
        return map.get(key);
    }

    /**
     * Adds an entry to this cache.
     * The new entry becomes the MRU (most recently used) entry.
     * If an entry with the specified key already exists in the cache, it is replaced by the new entry.
     * If the cache is full, the LRU (least recently used) entry is removed from the cache.
     * @param key    the key with which the specified value is to be associated.
     * @param value  a value to be associated with the specified key.
     */
    public synchronized void put(K key, V value) {
        map.put(key, value);
    }

    public synchronized void clear() {
        map.clear();
    }

    public synchronized int usedEntries() {
        return map.size();
    }

    /**
     * Returns a <code>Collection</code> that contains a copy of all cache entries.
     *
     * @return a <code>Collection</code> with a copy of the cache content.
     */
    public synchronized Collection<Map.Entry<K, V>> getAll() {
        return new ArrayList<Map.Entry<K, V>>(map.entrySet());
    }


    public static void main(String[] args) {
        LRUcache<String, String> c = new LRUcache(3);
        c.put("1", "one");
        c.put("2", "two");
        c.put("3", "three");
        c.put("4", "four");
        if (c.get("2") == null) throw new Error();
        c.put("5", "five");
        c.put("4", "second four");

        if (c.usedEntries() != 3) throw new Error();

        if (!c.get("4").equals("second four")) throw new Error();
        if (!c.get("5").equals("five")) throw new Error();
        if (!c.get("2").equals("two")) throw new Error();
        for (Map.Entry<String, String> e : c.getAll()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}



