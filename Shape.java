package main;

class Shape {
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shape{
    int getCorner(){
        return 4;
    }

    int superGetCorner(){
        return super.getCorner();
    }
}