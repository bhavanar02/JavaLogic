public class MyArrayList
{
    private int[] theArray;
    private int numItems;

    public MyArrayList()
    {
        theArray = new int[10];
        numItems = 0;
    }

    public void AddItem(int num)
    {
        if (numItems == theArray.length)
            GrowArray();
        theArray[numItems] = num;
        numItems++;
    }

    public RemoveItem()
    {
        numItems--;
    }

    public void GetItem(int index)
    {
        return theArray[index];
    }

    private void GrowArray()
    {
        int[] tempArray = new int[theArray.length*2];
        for (int i = 0; i < numItems; i++)
        {
            tempArray[i] = theArray[i];
        }
        theArray = tempArray;
    }

}
