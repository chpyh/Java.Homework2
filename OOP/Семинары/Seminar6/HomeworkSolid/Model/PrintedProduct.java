package Семинары.Seminar6.HomeworkSolid.Model;

//  ### Принцип открытости/закрытости 
//создаем класс физических изданий.
// здесь будет тип издания, артикул и название + реализация двух интерфейсов: проверки наличия книги 
// и проверки, не на руках ли она. 

public class PrintedProduct<T> extends Product<T>  {

    public boolean isInSide;
    public boolean isOutSide;
    protected T type;
    protected T id;

    public PrintedProduct(T type, T id) {
        this.type = type;
        this.id = id;
    }

    public PrintedProduct() {

    }

    public void setType(T type) {
        this.type = type;
    }

    @Override
    public T getType() {
        return type;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public T getId() {
        return id;

    }

    @Override
    public String toString() {
        return "\"" + type.toString() + "\"";
    }

    public void setInSide(boolean isInSide) {
        this.isInSide = isInSide;
    }

    public void setOutSide(boolean isOutSide) {
        this.isOutSide = isOutSide;
    }

}
