public class Pion extends Piece {

    public Pion(String nom, String couleur) {

        super(nom, couleur);
    }

    @Override
    public boolean estValide(Position depart, Position arrivee) {
        if (depart.getLigne() == arrivee.getLigne() && depart.getColonne() == arrivee.getColonne()) {
            return true;
        }

        int dx = arrivee.getColonne() - depart.getColonne();
        int dy = arrivee.getLigne() - depart.getLigne();

        if (getCouleur().equals("blanc")) {
            if (dx == 0 && (dy == -1 || (depart.getLigne() == 6 && dy == -2))) {
                return true;
            }
        } else if (getCouleur().equals("noir")) {
            if (dx == 0 && (dy == 1 || (depart.getLigne() == 1 && dy == 2))) {
                return true;
            }
        }

        return false;
    }
}
