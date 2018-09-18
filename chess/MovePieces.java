package chessGame;

import javax.swing.*;

class MovePieces extends SetValuesForControllers{

    void moveBlackPawn() {
        if (fightOneDownOneLeft()|| fightOneDownOneRight()) {
            doMove();
        } else if ((secondClicked() != buttons[fieldZero() + 1][fieldOne()]) || !iconIsNull()) {
            clearTextfields();
        } else {
            doMove();
        }
    }

    void moveWhitePawn() {
        if (fightOneUpOneRight() || fightOneUpOneLeft()) {
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

        for (int checkMovement = 0; checkMovement < checkIfCanMove.length; checkMovement++) {
            booleans[checkMovement] = secondClicked() == checkIfCanMove[checkMovement];
        }
        for (int iconIsNull = 0; iconIsNull < booleans.length; iconIsNull++) {
            bIconIsNull[iconIsNull] = booleans[iconIsNull] && iconIsNull();
        }
        for (int iconIsNotNull = 0; iconIsNotNull < booleans.length; iconIsNotNull++) {
            bIconIsNotNull[iconIsNotNull] = booleans[iconIsNotNull] && !iconIsNull();
        }

        if (bIconIsNull[0] || bIconIsNull[1] || bIconIsNull[2] || bIconIsNull[3] || bIconIsNull[4] || bIconIsNull[5] || bIconIsNull[6] || bIconIsNull[7]) {
            doMove();
        } else if (bIconIsNotNull[0] || bIconIsNotNull[1] || bIconIsNotNull[2] || bIconIsNotNull[3] || bIconIsNotNull[4] || bIconIsNotNull[5] || bIconIsNotNull[6] || bIconIsNotNull[7]) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveBishop() {
        if (fightOneDownOneRight() || (fightTwoDownTwoRight() && isIconOneDownOneRight() == null) || fightOneDownOneLeft() || (fightTwoDownTwoLeft() && isIconOneDownOneLeft() == null) || fightOneUpOneRight() || (fightTwoUpTwoRight() && isIconOneUpOneRight() == null) || fightOneUpOneLeft() || (fightTwoUpTwoLeft() && isIconOneUpOneLeft() == null)) {
            doMove();
        } else if (moveOneUpOneRight() || (moveTwoUpTwoRight() && isIconOneUpOneRight() == null) || moveOneUpOneLeft() || (moveTwoUpTwoLeft() && isIconOneUpOneLeft() == null) || moveOneDownOneRight() || (moveTwoDownTwoRight() && isIconOneDownOneRight() == null) || moveOneDownOneLeft() || (moveTwoDownTwoLeft() && isIconOneDownOneLeft() == null)) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveRook() {
        if (fightOneUp() || (fightTwoUp() && isIconOneUp() == null)  || fightOneDown() || (fightTwoDown() && isIconOneDown() == null) || fightOneRight() || (fightTwoRight() && isIconOneRight() == null) || fightOneLeft()|| (fightTwoLeft() && isIconOneLeft() == null)) {
            doMove();
        } else if ((moveOneUp()) || (moveTwoUp() && isIconOneUp() == null) || (moveOneDown() || (moveTwoDown() && isIconOneDown() == null)) || moveOneRight() || (moveTwoRight() && isIconOneRight() == null) || moveOneLeft() || (moveTwoLeft() && isIconOneLeft() == null)) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveQueen() {
        if ((moveOneUp()) || (moveTwoUp() && isIconOneUp() == null) || moveOneDown() || (moveTwoDown() && isIconOneDown() == null) || moveOneRight() || (moveTwoRight() && isIconOneRight() == null) || moveOneLeft() || (moveTwoLeft() && isIconOneLeft() == null) || (moveOneUpOneRight() || moveOneUpOneLeft() || moveOneDownOneRight() || moveOneDownOneLeft() || (moveTwoUpTwoRight() && isIconOneUpOneRight() == null) || (moveTwoUpTwoLeft() && isIconOneUpOneLeft() == null) || (moveTwoDownTwoRight() && isIconOneDownOneRight() == null) || (moveTwoDownTwoLeft() && isIconOneDownOneLeft() == null))) {
            doMove();
        } else if (fightOneUp() || (fightTwoUp() && isIconOneUp() == null)  || fightOneDown() || (fightTwoDown() && isIconOneDown() == null) || fightOneRight() || (fightTwoRight() && isIconOneRight() == null) || fightOneLeft() || (fightTwoLeft() && isIconOneLeft() == null) ) {
            doMove();
        } else if (fightOneDownOneRight() || (fightTwoDownTwoRight() && isIconOneDownOneRight() == null) || fightOneDownOneLeft() || (fightTwoDownTwoLeft() && isIconOneDownOneLeft() == null) || fightOneUpOneRight() || (fightTwoUpTwoRight() && isIconOneUpOneRight() == null) || fightOneUpOneLeft() || (fightTwoUpTwoLeft() && isIconOneUpOneLeft() == null)) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveKing() {
        if ((fightOneUp()) || fightOneDown() || fightOneRight() || fightOneLeft() || fightOneUpOneRight() || fightOneUpOneLeft() || fightOneDownOneRight() || fightOneDownOneLeft()) {
            doMove();
        } else if ((moveOneUp()) || moveOneDown() || moveOneRight() || moveOneLeft() || moveOneUpOneRight() || moveOneUpOneLeft() || moveOneDownOneRight() || moveOneDownOneLeft()) {
            doMove();
        } else {
            clearTextfields();
        }
    }
}
