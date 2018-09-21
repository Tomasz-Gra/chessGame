package chessGame;

class MovePieces extends SetValuesForControllers{

    void moveBlackPawn() {
        if (_1D() && iNull()) {
            doMove();
        } else if (_B00() || _B10() || _B20() || _B30() || _B40() || _B50() || _B60() || _B70()) {
                if (_1D1R() && !iNull() || (_1D1L() && !iNull())) {
                    doMove();
                }
            } else if (_1D1L() && !iNull() || (_1D1R() && !iNull())) {
                doMove();
            }
        }


    void moveWhitePawn() {
        if (_1U() && iNull()) {
            doMove();
        } else if (_B00() || _B10() || _B20() || _B30() || _B40() || _B50() || _B60() || _B70()) {
            if (_1U1R() && !iNull() || (_1U1L() && !iNull())) {
                doMove();
            }
        } else if (_1U1L() && !iNull() || (_1U1R() && !iNull())) {
            doMove();
        }
    }

    void moveKnight() {
        if (_B00()) {
            if (_2D1R() || _1D2R()) {
                doMove();
            }
        } else if (_B01()) {
            if (_2D1R() || _2D1L() || _1D2R()) {
                doMove();
            }
        } else if (_B02() || _B03() || _B04() || _B05()) {
            if (_2D1R() || _2D1L() || _1D2R() || _1D2L()) {
                doMove();
            }
        } else if (_B06()) {
            if (_2D1R() || _2D1L() || _1D2L()) {
                doMove(); }
        } else if (_B07()) {
            if (_2D1L() || _1D2L()) {
                doMove();
            }
        } else if (_B10() || _B11()) {
            if (_2D1R() || _2D1L() || _1D2R() || _1U2R()) {
                doMove();
            }
        } else if (_B12() || _B13() || _B14() || _B15()) {
            if (_2D1R() || _2D1L() || _1D2R() || _1D2L() || _1U2R() || _1U2L()) {
                doMove();
            }
        } else if (_B16() || _B17()) {
            if (_2D1R() || _2D1L() || _1D2L() || _1U2L()) {
                doMove();
            }
        } else if (_B60() || _B61()) {
            if (_2U1R() || _2U1L() || _1D2R() || _1U2R()) {
                doMove();
            }
        } else if (_B62() || _B63() || _B64() || _B65()) {
            if (_2U1R() || _2U1L() || _1D2R() || _1D2L() || _1U2R() || _1U2L()) {
                doMove();
            }
        } else if (_B66() || _B67()) {
            if (_2U1R() || _2U1L() || _1D2L() || _1U2L()) {
                doMove();
            }
        } else if (_B70()) {
            if (_2U1R() || _1U2R()) {
                doMove();
            }
        } else if (_B71()) {
            if (_2U1R() || _2U1L() || _1U2R()) {
                doMove();
            }
        } else if (_B72() || _B73() || _B74() || _B75()) {
            if (_2U1R() || _2U1L() || _1U2R() || _1U2L()) {
                doMove();
            }
        } else if (_B76()) {
            if (_2U1R() || _2U1L() || _1U2L()) {
                doMove();
            }
        } else if (_B77()) {
            if (_2U1L() || _1U2L()) {
                doMove();
            }
        } else if (_B20() || _B30() || _B40() || _B50()) {
            if (_2D1R() || _2U1R() || _1D2R() || _1U2R()) {
                doMove();
            }
        } else if (_B21() || _B31() || _B41() || _B51()) {
            if (_2D1R() || _2D1L() || _2U1R() || _2U1L() || _1D2R() || _1U2R()) {
                doMove();
            }
        } else if (_B26() || _B36() || _B46() || _B56()) {
            if (_2D1R() || _2D1L() || _2U1R() || _2U1L() || _1D2L() || _1U2L()) {
                doMove();
            }
        } else if (_B27() || _B37() || _B47() || _B57()) {
            if (_2D1L() ||  _2U1L() || _1D2L() || _1U2L()) {
                doMove();
            }
        } else if (_2D1R() || _2D1L() || _2U1R() || _2U1L() || _1D2R() || _1D2L() || _1U2R() || _1U2L()) {
            doMove();
        }
    }

    void moveBishop() {
        if (_B00()) {
            if (_1D1R() || (_2D2R() && _I_1D1R() == null)) {
                doMove();
            }
        } else if (_B01()) {
            if (_1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null)) {
                doMove();
            }
        } else if (_B02() || _B03() || _B04() || _B05()) {
            if (_1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null)) {
                doMove();
            }
        } else if (_B06()) {
            if (_1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null)) {
                doMove(); }
        } else if (_B07()) {
            if (_1D1L() || (_2D2L() && _I_1D1L() == null)) {
                doMove();
            }
        } else if (_B10()) {
            if (_1D1R() || (_2D2R() && _I_1D1R() == null) || _1U1R() || (_2U2R() && _I_1U1R() == null)) {
                doMove();
            }
        } else if (_B11()) {
            if (_1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || _1U1R() || _1U1L()) {
                doMove();
            }
        } else if (_B12() || _B13() || _B14() || _B15()) {
            if (_1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1R() || _1U1L()) {
                doMove();
            }
        } else if (_B16()) {
            if (_1D1R() || _1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1R() || _1U1L()) {
                doMove();
            }
        } else if (_B17()) {
            if (_1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B60()) {
            if (_1D1R() || (_2D2R() && _I_1D1R() == null) || _1U1R() || (_2U2R() && _I_1U1R() == null)) {
                doMove();
            }
        } else if (_B61()) {
            if (_1D1R() || _1D1L() || _1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L()) {
                doMove();
            }
        } else if (_B62() || _B63() || _B64() || _B65()) {
            if (_1D1R() || _1D1L() || _1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B66()) {
            if (_1D1R() || _1D1L() || _1U1R() || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B67()) {
            if (_1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B70()) {
            if (_1U1R() || (_2U2R() && _I_1U1R() == null)) {
                doMove();
            }
        } else if (_B71()) {
            if (_1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B72() || _B73() || _B74() || _B75()) {
            if (_1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B76()) {
            if (_1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B77()) {
            if (_1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B20() || _B30() || _B40() || _B50()) {
            if (_1D1R() || (_2D2R() && _I_1D1R() == null) || _1U1R() || (_2U2R() && _I_1U1R() == null)) {
                doMove();
            }
        } else if (_B21() || _B31() || _B41() || _B51()) {
            if (_1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || _1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L()) {
                doMove();
            }
        } else if (_B26() || _B36() || _B46() || _B56()) {
            if (_1D1R() || _1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1R() || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B27() || _B37() || _B47() || _B57()) {
            if (_1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
            doMove();
        }
    }

    void moveRook() {
        if (_B00()) {
            if (_1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null)) {
                doMove();
            }
        } else if (_B01()) {
            if (_1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L()) {
                doMove();
            }
        } else if (_B02() || _B03() || _B04() || _B05()) {
            if (_1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_B06()) {
            if (_1D() || (_2D() && _I_1D() == null) || _1R() || _1L() || (_2L() && _I_1L() == null)) {
                doMove(); }
        } else if (_B07()) {
            if (_1D() || (_2D() && _I_1D() == null) || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_B10()) {
            if (_1U() || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null)) {
                doMove();
            }
        } else if (_B11()) {
            if (_1U() || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L()) {
                doMove();
            }
        }else if (_B12() || _B13() || _B14() || _B15()) {
            if (_1U() || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_B16()) {
            if (_1U() || _1D() || (_2D() && _I_1D() == null) || _1R() || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_B17()) {
            if (_1U() || _1D() || (_2D() && _I_1D() == null) || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_B60()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || _1R() || (_2R() && _I_1R() == null)) {
                doMove();
            }
        } else if (_B61()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || _1R() || (_2R() && _I_1R() == null) || _1L()) {
                doMove();
            }
        } else if (_B62() || _B63() || _B64() || _B65()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_B66()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || _1R() || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_B67()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_B70()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1R() || (_2R() && _I_1R() == null)) {
                doMove();
            }
        } else if (_B71()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1R() || (_2R() && _I_1R() == null) || _1L()) {
                doMove();
            }
        } else if (_B72() || _B73() || _B74() || _B75()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_B76()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1R() || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_B77()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_B20() || _B30() || _B40() || _B50()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null)) {
                doMove();
            }
        } else if (_B21() || _B31() || _B41() || _B51()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L()) {
                doMove();
            }
        } else if (_B26() || _B36() || _B46() || _B56()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || (_2D() && _I_1D() == null) || _1R() || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_B27() || _B37() || _B47() || _B57()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || (_2D() && _I_1D() == null) || _1L() || (_2L() && _I_1L() == null)) {
                doMove();
            }
        } else if (_1U() || (_2U() && _I_1U() == null)  || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null)) {
            doMove();
        }
    }

    void moveQueen() {
        if (_B00()) {
            if (_1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1D1R() || (_2D2R() && _I_1D1R() == null)) {
                doMove();
            }
        } else if (_B01()) {
            if (_1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || _1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L()) {
                doMove();
            }
        } else if (_B02() || _B03() || _B04() || _B05()) {
            if (_1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null) || _1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null)) {
                doMove();
            }
        } else if (_B06()) {
            if (_1D() || (_2D() && _I_1D() == null) || _1R() || _1L() || (_2L() && _I_1L() == null) || _1D1R() || _1D1L() || (_2D2L() && _I_1D1L() == null)) {
                doMove(); }
        } else if (_B07()) {
            if (_1D() || (_2D() && _I_1D() == null) || _1L() || (_2L() && _I_1L() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null)) {
                doMove();
            }







        } else if (_B10()) {
            if (_1U() || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1D1R() || (_2D2R() && _I_1D1R() == null) || _1U1R()) {
                doMove();
            }
        } else if (_B11()) {
            if (_1U() || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || _1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || _1U1R() || _1U1L()) {
                doMove();
            }
        }else if (_B12() || _B13() || _B14() || _B15()) {
            if (_1U() || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null) || _1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1R() || _1U1L()) {
                doMove();
            }
        } else if (_B16()) {
            if (_1U() || _1D() || (_2D() && _I_1D() == null) || _1R() || _1L() || (_2L() && _I_1L() == null) || _1D1R() || _1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1R() || _1U1L()) {
                doMove();
            }
        } else if (_B17()) {
            if (_1U() || _1D() || (_2D() && _I_1D() == null) || _1L() || (_2L() && _I_1L() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1L()) {
                doMove();
            }




        } else if (_B60()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1D() || _1R() || (_2R() && _I_1R() == null) || _1D1R() || _1U1R() || (_2U2R() && _I_1U1R() == null)) {
                doMove();
            }
        } else if (_B61()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1D() || _1R() || (_2R() && _I_1R() == null) || _1L() || _1D1R() || _1D1L() || _1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L()) {
                doMove();
            }
        } else if (_B62() || _B63() || _B64() || _B65()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1D() || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null) || _1D1R() || _1D1L() || _1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B66()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1D() || _1R() || _1L() || (_2L() && _I_1L() == null) || _1D1R() || _1D1L() || _1U1R() || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B67()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || _1L() || (_2L() && _I_1L() == null) || _1D1L() || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }









        } else if (_B70()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1R() || (_2R() && _I_1R() == null) || _1U1R() || (_2U2R() && _I_1U1R() == null)) {
                doMove();
            }
        } else if (_B71()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || _1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L()) {
                doMove();
            }
        } else if (_B72() || _B73() || _B74() || _B75()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null) || _1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B76()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1R() || _1L() || (_2L() && _I_1L() == null) || _1U1R() || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B77()) {
            if (_1U() || (_2U() && _I_1U() == null) || _1L() || (_2L() && _I_1L() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B20() || _B30() || _B40() || _B50()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1D1R() || (_2D2R() && _I_1D1R() == null) || _1U1R() || (_2U2R() && _I_1U1R() == null)) {
                doMove();
            }
        } else if (_B21() || _B31() || _B41() || _B51()) {
            if (_1U() || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null) || _1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1R() || _1U1L()) {
                doMove();
            }
        } else if (_B26() || _B36() || _B46() || _B56()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null) || _1D1R() || _1D1L() || _1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_B27() || _B37() || _B47() || _B57()) {
            if (_1U() || (_2U() && _I_1U() == null)  || _1D() || (_2D() && _I_1D() == null) || _1L() || (_2L() && _I_1L() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
                doMove();
            }
        } else if (_1U() || (_2U() && _I_1U() == null)  || _1D() || (_2D() && _I_1D() == null) || _1R() || (_2R() && _I_1R() == null) || _1L() || (_2L() && _I_1L() == null) || _1D1R() || (_2D2R() && _I_1D1R() == null) || _1D1L() || (_2D2L() && _I_1D1L() == null) || _1U1R() || (_2U2R() && _I_1U1R() == null) || _1U1L() || (_2U2L() && _I_1U1L() == null)) {
            doMove();
        }
    }

    void moveKing() {
        if (_B00()) {
            if (_1D() || _1R() || _1D1R()) {
                doMove();
            }
        } else if (_B01() || _B06()) {
            if (_1D() || _1R() || _1L() || _1D1R() || _1D1L()) {
                doMove();
            }
        } else if (_B02() || _B03() || _B04() || _B05()) {
            if (_1D() || _1R() || _1L() || _1D1R() || _1D1L()) {
                doMove();
            }
        } else if (_B07()) {
            if (_1D() || _1L() || _1D1L()) {
                doMove();
            }
        } else if (_B10() || _B60()) {
            if (_1U() || _1D() || _1R() || _1U1R() || _1D1R()) {
                doMove();
            }
        } else if (_B17() || _B67()) {
            if (_1U() || _1D() || _1L() || _1U1L() || _1D1L()) {
                doMove();
            }
        } else if (_B70()) {
            if (_1U() || _1R() || _1U1R()) {
                doMove();
            }
        } else if (_B71() || _B76()) {
            if (_1U() || _1R() || _1L() || _1U1R() || _1U1L()) {
                doMove();
            }
        } else if (_B72() || _B73() || _B74() || _B75()) {
            if (_1U() || _1R() || _1L() || _1U1R() || _1U1L()) {
                doMove();
            }
        } else if (_B77()) {
            if (_1U() || _1L() || _1U1L()) {
                doMove();
            }
        } else if (_B20() || _B30() || _B40() || _B50()) {
            if (_1U() || _1D() || _1R() || _1U1R() || _1D1R()) {
                doMove();
            }
        } else if (_B27() || _B37() || _B47() || _B57()) {
            if (_1U() || _1D() || _1L() || _1U1L() || _1D1L()) {
                doMove();
            }
        } else if (_1U() || _1D() || _1R() || _1L() || _1U1R() || _1U1L() || _1D1R() || _1D1L()) {
            doMove();
        }
    }
}
