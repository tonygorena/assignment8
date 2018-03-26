package assignment8;

public class a8mainTest {
    public static void main(String[] args) throws Exception {


        int size = 23;
        boolean passed = true;
        Hasher hasher = new Hasher<String>();
        HashDictionary userHash = new HashDictionary<String>(size);


//        System.out.println("hash = " + hasher.hashForItem("tony", size));
//        System.out.println("hash = " + hasher.hashForItem("david", size));
//        System.out.println("hash = " + hasher.hashForItem("tim", size));

        //delete from empty table
        if (userHash.delete("tony") != -2)
            throw new Exception("delete from empty failed");


        int tony = userHash.insert("tony");
        int david = userHash.insert("david");
        int tim = userHash.insert("tim");
        userHash.show();

        //insert to table
        if (userHash.find("tony") != tony)
            throw new Exception("find 0 failed");
        if (userHash.find("david") != david)
            throw new Exception("find 1 failed");
        if (userHash.find("tim") != tim)
            throw new Exception("findt 2 failed");

        //find item not in table
        if (userHash.find("t") != -4)
            throw new Exception("item not in table failed");

        //delete item from table
        if (userHash.delete("tim") != tim)
            throw new Exception("delete item in table failed");


    }
}
