public class Main {
    public static void main(String[] args) {
        Sign test1 = new Sign("Everything on sale, please come in", 15);
        System.out.println(test1.numberOfLines());
        System.out.println(test1.getLines());
        Sign test2 = new Sign("Everything on sale, please come in", 17);
        System.out.println(test2.numberOfLines());
        System.out.println(test2.getLines());
        Sign test3 = new Sign("Everything on sale, please come in", 40);
        System.out.println(test3.numberOfLines());
        System.out.println(test3.getLines());



        System.out.println("\n\n\nAP Sample Code Table:");
        String str;
        int x;
        Sign sign1 = new Sign("ABC222DE", 3);
        x = sign1.numberOfLines(); //Expected: 3
        System.out.println(x);
        str = sign1.getLines(); //Expected: "ABC;222;DE"
        System.out.println(str);
        str = sign1.getLines(); //Expected: "ABC;222;DE"
        System.out.println(str);
        Sign sign2 = new Sign("ABCD", 10);
        x = sign2.numberOfLines(); //Expected: 1
        System.out.println(x);
        str = sign2.getLines(); //Expected: "ABCD"
        System.out.println(str);
        Sign sign3 = new Sign("ABCDEF", 6);
        x = sign3.numberOfLines(); //Expected: 1
        System.out.println(x);
        str = sign3.getLines(); //Expected: "ABCDEF"
        System.out.println(str);
        Sign sign4 = new Sign("", 4);
        x = sign4.numberOfLines(); //Expected: 0
        System.out.println(x);
        str = sign4.getLines(); //Expected: null
        System.out.println(str);
        Sign sign5 = new Sign("AB_CD_EF", 2);
        x = sign5.numberOfLines(); //Expected: 4
        System.out.println(x);
        str = sign5.getLines(); //Expected: "AB;_C;D_;EF"
        System.out.println(str);
    }
}