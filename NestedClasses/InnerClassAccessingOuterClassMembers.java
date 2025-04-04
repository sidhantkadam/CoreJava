package NestedClasses;

class Library
{
    private String libraryName;

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    class Book
    {
        public String getLibraryName()
        {
            return libraryName;
        }
    }

}

public class InnerClassAccessingOuterClassMembers
{
    public static void main(String[] args) {
        Library libraryName = new Library("Bombay Library");
        Library.Book newBook = libraryName.new Book();
        System.out.println(newBook.getLibraryName());
    }
}
