/**
 * Created by amitavk on 29/05/17.
 */

fun main(args: Array<String>) {
    GameModel.resetGame()

    GamePresenter.onDeckTap()
    GameModel.debugPrint()
}