public class Tour extends Piece {

    public Tour(String nom, String couleur) {

        super(nom, couleur);
    }

    @Override
    public boolean estValide(Position depart, Position arrivee) {
        if (depart.getLigne() == arrivee.getLigne() && depart.getColonne() == arrivee.getColonne()) {
            return true;
        }
        int x = arrivee.getLigne() - depart.getLigne() ;
        int y = arrivee.getColonne() - depart.getColonne() ;

        return 

        return (depart.getLigne() == arrivee.getLigne() || depart.getColonne() == arrivee.getColonne());
    }
}
