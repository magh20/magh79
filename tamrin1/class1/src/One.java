public class One {
    public static void main(String[] args) {
        library book1=new library();
        library book2=new library();
        book1.book_name="riazi1";
        book1.book_author="faramarzi";
        book1.book_subject="riazi";
        book1.person_name="mohammad ";

        book2.book_name="fizik1";
        book2.book_author="zareh";
        book2.book_subject="fizik";
        book2.person_name="ali ";

        System.out.println("pls enter the book1 name and author:" + book1.book_name +"/"+ book1.book_author);
        book1.amanat();
        System.out.println("pls enter the book2 name and author:" + book2.book_name +"/"+ book2.book_author);
        book2.amanat();

        System.out.println("pls giveback the book1.");
        book1.pasdadan();
        System.out.println("pls giveback the book2.");
        book2.pasdadan();


    }
}
