package chessGame;

import javax.swing.*;

class MovePieces extends SetValuesForControllers{

    void moveBlackPawn() {
        if (_F_1D_1L_B11()|| _F_1D_1R_B10()) {
            doMove();
        } else if ((secondClicked() != buttons[fieldZero() + 1][fieldOne()]) || !iconIsNull()) {
            clearTextfields();
        } else {
            doMove();
        }
    }

    void moveWhitePawn() {
        if (_F_1U_1R_B8() || _F_1U_1L_B9()) {
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
        if (_F_1D_1R_B10() || (_F_2D_2R_B14() && _I_1D1R() == null) || _F_1D_1L_B11() || (_F_2D_2L_B15() && _I_1D1L() == null) || _F_1U_1R_B8() || (_F_2U_2R_B12() && _I_1U1R() == null) || _F_1U_1L_B9() || (_F_2U_2L_B13() && _I_1U1L() == null)) {
            doMove();
        } else if (_M_1U_1R_B8() || (_M_2U_2R_B12() && _I_1U1R() == null) || _M_1U_1L_B9() || (_M_2U_2L_B13() && _I_1U1L() == null) || _M_1D_1R_B10() || (_M_2D_2R_B14() && _I_1D1R() == null) || _M_1D_1L_B11() || (_M_2D_2L_B15() && _I_1D1L() == null)) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveRook() {
        if (_F_1U_B0() || (_F_2U_B4() && _I_1U() == null)  || _F_1D_B1() || (_F_2D_B5() && _I_1D() == null) || _F_1R_B2() || (_F_2R_B6() && _I_1R() == null) || _F_1L_B3()|| (_F_2L_B7() && _I_1L() == null)) {
            doMove();
        } else if ((_M_1U_B0()) || (_M_2U_B4() && _I_1U() == null) || (_M_1D_B1() || (_M_2D_B5() && _I_1D() == null)) || _M_1R_B2() || (_M_2R_B6() && _I_1R() == null) || _M_1L_B3() || (_M_2L_B7() && _I_1L() == null)) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveQueen() {
        if ((_M_1U_B0()) || (_M_2U_B4() && _I_1U() == null) || _M_1D_B1() || (_M_2D_B5() && _I_1D() == null) || _M_1R_B2() || (_M_2R_B6() && _I_1R() == null) || _M_1L_B3() || (_M_2L_B7() && _I_1L() == null) || (_M_1U_1R_B8() || _M_1U_1L_B9() || _M_1D_1R_B10() || _M_1D_1L_B11() || (_M_2U_2R_B12() && _I_1U1R() == null) || (_M_2U_2L_B13() && _I_1U1L() == null) || (_M_2D_2R_B14() && _I_1D1R() == null) || (_M_2D_2L_B15() && _I_1D1L() == null))) {
            doMove();
        } else if (_F_1U_B0() || (_F_2U_B4() && _I_1U() == null)  || _F_1D_B1() || (_F_2D_B5() && _I_1D() == null) || _F_1R_B2() || (_F_2R_B6() && _I_1R() == null) || _F_1L_B3() || (_F_2L_B7() && _I_1L() == null) ) {
            doMove();
        } else if (_F_1D_1R_B10() || (_F_2D_2R_B14() && _I_1D1R() == null) || _F_1D_1L_B11() || (_F_2D_2L_B15() && _I_1D1L() == null) || _F_1U_1R_B8() || (_F_2U_2R_B12() && _I_1U1R() == null) || _F_1U_1L_B9() || (_F_2U_2L_B13() && _I_1U1L() == null)) {
            doMove();
        } else {
            clearTextfields();
        }
    }

    void moveKing() {
        if ((_F_1U_B0()) || _F_1D_B1() || _F_1R_B2() || _F_1L_B3() || _F_1U_1R_B8() || _F_1U_1L_B9() || _F_1D_1R_B10() || _F_1D_1L_B11()) {
            doMove();
        } else if ((_M_1U_B0()) || _M_1D_B1() || _M_1R_B2() || _M_1L_B3() || _M_1U_1R_B8() || _M_1U_1L_B9() || _M_1D_1R_B10() || _M_1D_1L_B11()) {
            doMove();
        } else {
            clearTextfields();
        }
    }
}
