package metier;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {

    // Couplage faible

    // If we use @Autowired and we have lot of beans we should use @Qualifier to specify which instance to inject
    // For example @Qualifier("dao2")
    // this case is only with @Autowired, we don't face it whe  we're injecting in the constructor
    private IDao dao;


    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp * 5 + Math.cos(tmp * Math.PI) / 100;
        return res;
    }

    // Injecter dans la variable dao un objet d'une classe
    // Qui implemente l'interface IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
