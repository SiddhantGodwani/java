class Typecasting 
    {
        public static void main(String args[]){
            //Implicit
            byte b = 3;
            int n = b;  // Implicit conversion
            System.out.println(n);


            // Explicit
            // byte b = 127;
            // byte c = 257;     lossy conversion error cus' out of range -128 to 127 of byte
            // int a = b ;

            // int a = 27 ;
            int a = 257 ;
            byte k = (byte)a;  // only a will givee lossy conversion or incompatible types error
            System.out.println(k);
            
            float f = 5.6f;
            int i = (int)f;  // Type conversion of 5.6 looses .6 as data loss in compression
            System.out.println(i);

        }
    }
