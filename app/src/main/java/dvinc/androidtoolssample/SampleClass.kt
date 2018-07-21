package dvinc.androidtoolssample

/**
 * Class for checking test coverage by jacoco.
 */
class SampleClass {

    fun createListWith10Values(): List<Int> {

        val magicVal = 10

        val list = ArrayList<Int>()

        (0 until 10).forEach {
            list.add(it * magicVal)
        }

        return list
    }
}
 