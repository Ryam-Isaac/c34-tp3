public class Case {

    Piece piece;

//•	un construisant une Case vide
    public Case (Piece piece){
        this.piece = null ;
    }
//•	un construisant une Case avec n’importe quelle Piece dessus
    public Case () {
        this.piece =getPiece();
    }

 //   •	une méthode d’accès pour la pièce
//•	une méthode de mutation pour la pièce


    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    //•	une méthode permettant de savoir si oui ou non une Case est occupée

    public boolean estOccupee (Case caseSelectionnee){
        if (caseSelectionnee == null){
            return false;
        }
        return true;
    }

    //•	une méthode permettant de savoir si une Case est occupée par une pièce d’une certaine couleur
    public boolean estOccupee (String couleur, Case caseSelectionnee) {

        if (couleur.equals("blanc") && caseSelectionnee.estOccupee(caseSelectionnee )){
          return true;
        }
        else if (couleur.equals("noir") && caseSelectionnee.estOccupee(caseSelectionnee )){
            return false;
        }
        return false  ;
    }


    //•	une méthode permettant d’enlever la pièce sur la Case et de retourner cette pièce
    public Piece enleverPiece(Piece piece){
        return this.piece = enleverPiece(piece);
    }

}
