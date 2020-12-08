package com.bdqn.entity;


import java.util.Date;

public class Books {

  private long bookId;
  private String bookName;
  private String bookAuthor;
  private String bookPublish;
  private long bookPage;
  private double bookPrice;
  private Date createDate;


  public long getBookId() {
    return bookId;
  }

  public void setBookId(long bookId) {
    this.bookId = bookId;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getBookAuthor() {
    return bookAuthor;
  }

  public void setBookAuthor(String bookAuthor) {
    this.bookAuthor = bookAuthor;
  }

  public String getBookPublish() {
    return bookPublish;
  }

  public void setBookPublish(String bookPublish) {
    this.bookPublish = bookPublish;
  }

  public long getBookPage() {
    return bookPage;
  }

  public void setBookPage(long bookPage) {
    this.bookPage = bookPage;
  }

  public double getBookPrice() {
    return bookPrice;
  }

  public void setBookPrice(double bookPrice) {
    this.bookPrice = bookPrice;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  @Override
  public String toString() {
    return "Books{" +
            "bookId=" + bookId +
            ", bookName='" + bookName + '\'' +
            ", bookAuthor='" + bookAuthor + '\'' +
            ", bookPublish='" + bookPublish + '\'' +
            ", bookPage=" + bookPage +
            ", bookPrice=" + bookPrice +
            ", createDate=" + createDate +
            '}';
  }
}
