package chessGame;

import java.awt.event.ActionEvent;

class SetValuesForControllers extends Variables {

    void setValuesForController(ActionEvent eventActionListener) {
        if (!textField[0].getText().isEmpty()) {
            for (int x = 0; x < buttons.length; x++) {
                for (int y = 0; y < buttons.length; y++) {
                    if (eventActionListener.getSource() == buttons[x][y]) {
                        textField[2].setText(Integer.toString(x));
                        textField[3].setText(Integer.toString(y));
                    }
                }
            }
        } else {
            for (int x = 0; x < buttons.length; x++) {
                for (int y = 0; y < buttons.length; y++) {
                    if (eventActionListener.getSource() == buttons[x][y]) {
                        textField[0].setText(Integer.toString(x));
                        textField[1].setText(Integer.toString(y));
                    }
                }
            }
        }
    }
}
