package dvinc.androidtoolssample

/**
 * Class for checking test coverage by jacoco.
 */
class SampleClass {

    fun pingInstructionsMethod() {

        val magicVal = 10

        val list = ArrayList<Int>()

        (0..10).forEach {
            list.add(it * magicVal)
        }
    }
}
 