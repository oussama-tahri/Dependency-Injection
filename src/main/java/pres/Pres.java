package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres {
    public static void main(String[] args) throws Exception {
        // Instanciation dynamique
        Scanner scanner = new Scanner(new File("config.txt"));


        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();


        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();


        Method method = cMetier.getMethod("setDao", IDao.class);
        // metier.setDao(dao);
        method.invoke(metier, dao);

        System.out.println("Resultat=> "+metier.calcul());
    }
}
