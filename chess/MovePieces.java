package chessGame;

import javax.swing.*;

class MovePieces extends SetValuesForControllers {

    void moveBlackPawn() {
        boolean SE = ((secondClicked() == buttons[fieldZero() + 1][fieldOne() + 1]) && !iconIsNull());
        boolean SW = ((secondClicked() == buttons[fieldZero() + 1][fieldOne() - 1]) && !iconIsNull());

        if (SE || SW) {
            doMove();
        } else if ((secondClicked() != buttons[fieldZero() + 1][fieldOne()]) || !iconIsNull()) {
            clearTextfields();
        } else {
            doMove();
        }
    }

    void moveWhitePawn() {
        boolean NW = ((secondClicked() == buttons[fieldZero() - 1][fieldOne() - 1]) && !iconIsNull());
        boolean NE = ((secondClicked() == buttons[fieldZero() - 1][fieldOne() + 1]) && !iconIsNull());

        if (NW || NE) {
            doMove();
        } else if ((secondClicked() != buttons[fieldZero() - 1][fieldOne()]) || !iconIsNull()) {
            clearTextfields();
        } else {
            doMove();
        }
    }

    void moveKnight() {
        boolean[] booleans = new boolean[8];
        boolean[] bIconIsNull = new boolean[8];
        boolean[] bIconIsNotNull = new boolean[8];

        JButton[] checkIfCanMove = {buttons[fieldZero() + 2][fieldOne() + 1], buttons[fieldZero() + 2][fieldOne() - 1], buttons[fieldZero() - 2][fieldOne() + 1], buttons[fieldZero() - 2][fieldOne() - 1], buttons[fieldZero() + 1][fieldOne() + 2], buttons[fieldZero() + 1][fieldOne() - 2], buttons[fieldZero() - 1][fieldOne() + 2], buttons[fieldZero() - 1][fieldOne() - 2]};

        for (int checkMovement = 0; checkMovement < checkIfCanMove.length; checkMovement++) { booleans[checkMovement] = secondClicked() == checkIfCanMove[checkMovement]; }
        for (int iconIsNull = 0; iconIsNull < booleans.length; iconIsNull++) { bIconIsNull[iconIsNull] = booleans[iconIsNull] && iconIsNull(); }
        for (int iconIsNotNull = 0; iconIsNotNull < booleans.length; iconIsNotNull++) { bIconIsNotNull[iconIsNotNull] = booleans[iconIsNotNull] && !iconIsNull(); }

        if (bIconIsNull[0] || bIconIsNull[1] || bIconIsNull[2] || bIconIsNull[3] || bIconIsNull[4] || bIconIsNull[5] || bIconIsNull[6] || bIconIsNull[7]) {
            doMove();
        } else if (bIconIsNotNull[0] || bIconIsNotNull[1] || bIconIsNotNull[2] || bIconIsNotNull[3] || bIconIsNotNull[4] || bIconIsNotNull[5] || bIconIsNotNull[6] || bIconIsNotNull[7]) {
            doMove();
        } else {
            clearTextfields();
        }
    }
}
