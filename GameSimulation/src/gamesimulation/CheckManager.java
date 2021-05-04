package gamesimulation;
import Services.CheckTheGamer;
import Entities.Gamer;
import mernis.IFRKPSPublicSoap;


public class CheckManager implements CheckTheGamer {
    @Override
    public void check(Gamer gamer) throws Exception {
        IFRKPSPublicSoap ifrkpsPublicSoap = new IFRKPSPublicSoap();

        if(ifrkpsPublicSoap.TCKimlikNoDogrula(gamer.getIdentityId(), gamer.getFirstName(), gamer.getLastName(), gamer.getYearOfBirth())){          //FIX ME!
            System.out.println("Bilgileriniz doğrulandı. Sisteme Hoşgeldiniz.");
        } else{
            System.out.println("Bilgileriniz doğrulanamadı, lütfen kontrol ediniz ");
        }

    }
}

