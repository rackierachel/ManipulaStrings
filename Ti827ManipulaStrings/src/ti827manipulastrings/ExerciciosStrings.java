
package ti827manipulastrings;


class ExerciciosStrings {
    static String s,s1;

    static void LeStrings(String texto){
        System.out.println(texto);
        s = Ti827ManipulaStrings.ler.next();
        s1 = Ti827ManipulaStrings.ler.nextLine();
        s = s+s1;
    }
    
    static int contaCaracteres() {
       LeStrings("Insira um texto");
        return s.length();
    }

    static void arvoreCharAt() {
      int x,y;
      LeStrings("Insira uma palavra");
        for (x=0;x<s.length();x++){
            for(y=0;y<=x;y++){
                System.out.print(s.charAt(y));
            }
        System.out.println();
        for (x=s.length()-1; x>=0;x--){
            for (y=0; y<x;y++){
                System.out.print(s.charAt(y));
            }
        System.out.println();
        }
        }
    }

    static void capitalizaLetras() {
         
        LeStrings ("Insira uma palavra: ");
        System.out.println(s.toLowerCase());
        LeStrings ("Insira outra palavra: ");
        System.out.println(s.toUpperCase());
      
       
        
                

    
} 
       
}   
    
      

    
