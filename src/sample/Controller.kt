package sample

import javafx.event.Event
import javafx.fxml.FXML
import javafx.scene.control.Button
import javafx.scene.control.TextArea
import javax.script.ScriptEngineManager

class Controller {
    @FXML
    lateinit var textArea: TextArea
    @FXML
    lateinit var one:Button
    @FXML
    lateinit var two:Button
    @FXML
    lateinit var three:Button
    @FXML
    lateinit var plus:Button
    @FXML
    lateinit var equal:Button
    @FXML
    lateinit var minus:Button
    @FXML
    lateinit var clear:Button

    fun result(e: Event){

        when (e.source) {
            one -> {
                textArea.text = textArea.text + "1"
            }
            two -> {
                textArea.text = textArea.text + "2"
            }
            three -> {
                textArea.text = textArea.text + "3"
            }
            plus -> {
                textArea.text = textArea.text + "+"
            }
            minus -> {
                textArea.text = textArea.text + "-"
            }
            clear -> {
                textArea.text = ""
            }
            equal -> {
                val manager = ScriptEngineManager()
                val engine = manager.getEngineByName("js")
                val result = engine.eval(textArea.text)
                textArea.text = result.toString()
            }
        }
    }

}