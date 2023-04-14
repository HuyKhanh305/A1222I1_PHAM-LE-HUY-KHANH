package ss04_oop_huong_doi_tuong.thuchanh.lop_hinh_chu_nhat;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return width * height;
    }

    public int getPerimeter(){
        return (width + height) * 2;
    }

    public String display(){
        return "Rectangle{"+ "width= "+ width + ", height= "+ height + "}";
    }
}
