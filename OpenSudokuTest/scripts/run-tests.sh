#!/bin/bash

adb shell am instrument -w com.nigelj.freedoku.test/android.test.InstrumentationTestRunner

# run single test:
# adb shell am instrument -w -e class com.nigelj.freedoku.game.CellNoteTest com.nigelj.freedoku/android.test.InstrumentationTestRunner

exit 0
