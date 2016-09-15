import java.util.*;

public class Book implements Comparable<Book>{
    private String title;
    private Date publishDate;
    private String comment;
    public final int hashCode() {
        int result = 53;
        result = result * 43 + this.title.hashCode();
        result = result * 43 + this.publishDate.hashCode();
        return result;
    }
    public final boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if (!(o instanceof Book)) return false;
        Book recast = (Book) o;
        if (!this.title.equals(recast.title)) return false;
        if (!this.publishDate.equals(recast.publishDate)) return false;
        return true;
    }
    public final int compareTo(Book o) {
        if (this.publishDate.getTime() < o.publishDate.getTime()) return -1;
        if (this.publishDate.getTime() == o.publishDate.getTime()) return 0;
        return 1;
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
        Book copying = new Book();
        copying.title = this.title;
        copying.publishDate = (Date) this.publishDate.clone();
        return copying;
    }
}
