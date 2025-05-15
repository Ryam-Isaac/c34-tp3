public class Cavalier extends Piece {

    public Cavalier(String nom, String couleur) {

        super(nom, couleur);
    }


    @Override
    public boolean estValide(Position depart, Position arrivee) {
        if (depart.getLigne() == arrivee.getLigne() && depart.getColonne() == arrivee.getColonne()) {
            return true;
        }

        int dx = Math.abs(arrivee.getColonne() - depart.getColonne());
        int dy = Math.abs(arrivee.getLigne() - depart.getLigne());

        return (dx == 2 && dy == 1) || (dx == 1 && dy == 2);
    }
}
