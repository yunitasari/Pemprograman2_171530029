
package Praktikum10.percobaan;

public class Bentukwajah {
    /*Membuat sebuah method respons pada class induk dimana mengembalikan sebuah nilai string*/
        public String respons(){
            return("Perhatikan reaksi wajah saya\n");
        }
    }
    
/*Membuat class class lain dengan turunan dari class bentukwajah*/
    class Senyum extends Bentukwajah{
        public String respons(){
            return("Senyum karena gembira\n");
        }
    }
    
    class Tertawa extends Bentukwajah{
        public String respons(){
            return("Tertawa karena gembira\n");
        }
    }
    
    class Marah extends Bentukwajah{
        public String respons(){
            return("kemarahan disebabkan bertangkar\n");
        }
    }
    
    class Sedih extends Bentukwajah{
        public String respons(){
            return("Sedih disebabkan cemburu\n");
        }
    }
