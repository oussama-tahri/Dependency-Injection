package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double tmp = Math.random()*40;
        return tmp;
    }
}
