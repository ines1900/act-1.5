public class Main{
   public static void main(String[] args) {

        Livre l1 = new Livre("Le petit prince","St Exup�ry",10.40f, 50) ;
        Livre l2 = new Livre("Contes","Grimm",14.40f,254) ;
        l1.afficher();
        l2.afficher();
     
       

        BD b1 = new BD("Lucky Luke","Morris",10.40f, 45, true);
        BD b2 = new BD("Tintin","Herge",200.40f, 45, false) ;
        b1.afficher() ;
        b2.afficher() ;

        Manga m1 = new Manga("One piece","Eiichiro Oda",5.40f, 62);
        Manga m2 = new Manga("Death Note","Tsugumi Oba",7.40f, 75) ;
        m1.afficher() ;
        m2.afficher() ;

        Roman r1 = new Roman("Dora","Dora", 300f, 3) ;
        r1.setNbChapitre(12);
        r1.setDescription("Une description quelconque");
        System.out.println(r1.toString());

        LivreRecette lrc1 = new LivreRecette("Marmiton", "Philippe Etchebest", 15.98f, 110);
        Recette rc1 = new Recette("Les p�tes crues", "Comment r�aliser de d�licieuses p�tes crues.", 3);
        rc1.addAstuce("Ne pas les faire cuire.");
        rc1.addEtape("Sortir les p�tes de leur emballage");
       
        

     }

   

}
 