public class Reine extends Piece {

    public Reine(String nom, String couleur) {

        super(nom, couleur);
    }

    @Override
    public boolean estValide(Position depart, Position arrivee) {
        if (depart.getLigne() == arrivee.getLigne() && depart.getColonne() == arrivee.getColonne()) {
            return true;
        }

        int dx = Math.abs(arrivee.getColonne() - depart.getColonne());
        int dy = Math.abs(arrivee.getLigne() - depart.getLigne());

        return dx == dy ;
    }
}
