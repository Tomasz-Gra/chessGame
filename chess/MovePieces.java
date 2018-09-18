package chessGame;

class MovePieces extends SetValuesForControllers{

    void moveBlackPawn() {
        if (_1D1R() && !iNull() || _1D1L() && !iNull()) {
            doMove();
        } else if (_1D() && iNull()) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveWhitePawn() {
        if (_1U1R() && !iNull() || _1U1L() && !iNull()) {
            doMove();
        } else if (_1U() && iNull()) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveKnight() {
        if (_2D1R() || _2D1L() || _2U1R() || _2U1L() || _1D2R() || _1D2L() || _1U2R() || _1U2L()) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveBishop() {
        if (_1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveRook() {
        if (_1U() || (_2U() && _I_1U() == null)  || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null)) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveQueen() {
        if (_1U() || (_2U() && _I_1U() == null)  || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null) ) {
            doMove();
        } else if (_1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveKing() {
        if ((_1U()) || _1D() || _1R() || _1L() || _1U1R() || _1U1L() || _1D1R() || _1D1L()) {
            doMove();
        } else {
            clearTextfields();
        }
    }
}
