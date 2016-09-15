import java.util.*;

public class Book implements Comparable<Book> ,Cloneable{
    private String title;
    private Date publishDate;
    private String comment;
    public final int hashCode() {
        int result = 53;
        result = result * 43 + this.title.hashCode();
        result = result * 43 + this.publishDate.hashCode();
        return result;
    }
    public final boolean equals(Object obj) {
        if (obj == this) {return true;}
        if (obj == null) {return false;}
        if (!(obj instanceof Book)) {return false;}
        Book recastObj = (Book) obj;
        if (!this.title.equals(recastObj.title)) {return false;}
        if (!this.publishDate.equals(recastObj.publishDate)) {return false;}
        return true;
    }
    public final int compareTo(Book o) {
        if (this.publishDate.getTime() < o.publishDate.getTime()) {return -1;}
        if (this.publishDate.getTime() > o.publishDate.getTime()) {return 1;}
        return 0;
    }
    public final void setTitle(String _title) {
        this.title = _title;
    }
    public final void setPublishDate(Date _publishDate) {
        this.publishDate = _publishDate;
    }
    public final String getTitle () {
        return this.title;
    }

    public final Date getPublishDate() {
        return this.publishDate;
    }
    public final Book clone() {
        Book copyingBook = new Book();
        copyingBook.title = this.title;
        copyingBook.publishDate = (Date) this.publishDate.clone();
        return copyingBook;
    }
}
