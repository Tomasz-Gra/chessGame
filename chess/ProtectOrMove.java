package chessGame;

class ProtectOrMove extends MovePieces {

    void protectOrMove() {
        for (int protectPiece = 0; protectPiece < 12; protectPiece++) {
            protectChess[protectPiece] = firstClicked().getIcon() == icons[protectPiece];
        }

        if (!(textField[0].getText().isEmpty() && textField[1].getText().isEmpty())) {
            if (!(textField[2].getText().isEmpty() && textField[3].getText().isEmpty())) {
                if (protectChess[0] || protectChess[1] || protectChess[2] || protectChess[3] || protectChess[4] || protectChess[5]) {
                    protectBlackChess();
                } else if (protectChess[6] || protectChess[7] || protectChess[8] || protectChess[9] || protectChess[10] || protectChess[11]) {
                    protectWhiteChess();
                } else if (firstClicked().getIcon() == null) {
                    clearTextfields();
                }
            }
        }
    }
    private void protectBlackChess() {
        for (int protectBlackPiece = 0; protectBlackPiece < 12; protectBlackPiece++) {
            protectChess[protectBlackPiece] = buttons[fieldTwo()][fieldThree()].getIcon() == icons[protectBlackPiece];
        }
        if (protectChess[0] || protectChess[1] || protectChess[2] || protectChess[3] || protectChess[4] || protectChess[5]){
            clearTextfields();
        } else {
            checkIfICanMove();
        }
    }
    private void protectWhiteChess() {
        for (int protectWhitePiece = 6; protectWhitePiece < 12; protectWhitePiece++) {
            protectChess[protectWhitePiece] = buttons[fieldTwo()][fieldThree()].getIcon() == icons[protectWhitePiece];
        }
        if (protectChess[6] || protectChess[7] || protectChess[8] || protectChess[9] || protectChess[10] || protectChess[11]){
            clearTextfields();
        } else {
            checkIfICanMove();
        }
    }

    private void checkIfICanMove() {
        if (firstClicked().getIcon() == icons[5]) {
            moveBlackPawn();
        } else if (firstClicked().getIcon() == icons[11]) {
            moveWhitePawn();
        } else if (firstClicked().getIcon() == icons[1] || firstClicked().getIcon() == icons[7]) {
            moveKnight();
        } else {
            doMove();
        }
    }
}
