class Solution
{
    // create hashset to store keys
    HashSet<Integer> keys = new HashSet<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms)
    {
        // go to all rooms starting at room 0
        traverseRooms(rooms, 0);

        // check if there is a key for all rooms
        for (int i = 1; i < rooms.size(); i++)
        {
            if (!keys.contains(i))
            {
                return false;
            }
        }
        return true;
    }
    public void traverseRooms(List<List<Integer>> rooms, int room)
    {
        // traverse all keys in given room
        for (Integer key : rooms.get(room))
        {
            // check if key is already present (room has been entered)
            if (!keys.contains(key))
            {
                // add key to set and traverse room that they key unlocks recursively
                keys.add(key);
                traverseRooms(rooms, key);
            }
        }
    }
}
