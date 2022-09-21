
package ti827manipulastrings;


class ExerciciosStrings {

    static int contaCaracteres() {
        String s,s1;
        System.out.println("Insira um texto");
        s = Ti827ManipulaStrings.ler.next();
        s1 = Ti827ManipulaStrings.ler.nextLine();
        s = s+s1;
        return s.length();
    }
    
}
