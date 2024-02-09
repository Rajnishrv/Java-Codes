// total 8 primitive data types

class data_type{
    public static void main(String[] argu){
        
        //1. we can store only 256 no in byte data type (1 byte)[-128 to +127]
        byte b = 3;
        System.out.println("1.Byte: "+b);

        //2. we can store only single charactor in char data type(2 bytes)['a' to 'z','%',','...]
        char ch = 'a';
        System.out.println("2.Charactor: "+ch);

        //3. we can store only True or false in boolean datatype(2 bytes)
        boolean var = true,var2 = false;
        System.out.println("3.Bloolean: " +var2 +" "+ var);

        //4. we can store only integer value in int data type(4 bytes)[-2B to +2B]
        //5. long for big data(8 bytes)
        int i = 55;
        System.out.println("4.Integer: " +i);

        //6. we can store float value in float data type(4 bytes)
        //7. double for long data(8 bytes)

        // note:- if we want to print float value we need to add f after the value authe wise compilar autometic detact double value

        float fl=23.5f;
        System.out.print("5.Float: "+fl);

        //8. we can store number in short data type(2 bytes)
        short s = 253;
        System.out.println("6.Short: "+s);
        System.out.println("Other data type is \n7.Double and \n8.Long");

    } 
}