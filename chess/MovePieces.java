package chessGame;

class MovePieces extends SetValuesForControllers{

    void moveBlackPawn() {
        if (_F_1D_1R() && !iNull() || _F_1D_1L() && !iNull()) {
            doMove();
        } else if (_F_1D() && iNull()) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveWhitePawn() {
        if (_F_1U_1R() && !iNull() || _F_1U_1L() && !iNull()) {
            doMove();
        } else if (_F_1U() && iNull()) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveKnight() {
        if (_2D_1R() || _2D_1L() || _2U_1R() || _2U_1L() || _1D_2R() || _1D_2L() || _1U_2R() || _1U_2L()) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveBishop() {
        if (_F_1D_1R() || (_F_2D_2R() && _I_1D1R() == null) || _F_1D_1L() || (_F_2D_2L() && _I_1D1L() == null) || _F_1U_1R() || (_F_2U_2R() && _I_1U1R() == null) || _F_1U_1L() || (_F_2U_2L() && _I_1U1L() == null)) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveRook() {
        if (_F_1U() || (_F_2U() && _I_1U() == null)  || _F_1D() || (_F_2D() && _I_1D() == null) || _F_1R() || (_F_2R() && _I_1R() == null) || _F_1L() || (_F_2L() && _I_1L() == null)) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveQueen() {
        if (_F_1U() || (_F_2U() && _I_1U() == null)  || _F_1D() || (_F_2D() && _I_1D() == null) || _F_1R() || (_F_2R() && _I_1R() == null) || _F_1L() || (_F_2L() && _I_1L() == null) ) {
            doMove();
        } else if (_F_1D_1R() || (_F_2D_2R() && _I_1D1R() == null) || _F_1D_1L() || (_F_2D_2L() && _I_1D1L() == null) || _F_1U_1R() || (_F_2U_2R() && _I_1U1R() == null) || _F_1U_1L() || (_F_2U_2L() && _I_1U1L() == null)) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveKing() {
        if ((_F_1U()) || _F_1D() || _F_1R() || _F_1L() || _F_1U_1R() || _F_1U_1L() || _F_1D_1R() || _F_1D_1L()) {
            doMove();
        } else {
            clearTextfields();
        }
    }
}
