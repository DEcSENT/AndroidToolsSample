# Android Tools Sample

[![Codacy Badge](https://api.codacy.com/project/badge/Grade/c890d64c5d634970b2307348ae48e8a7)](https://app.codacy.com/app/DEcSENT/AndroidToolsSample?utm_source=github.com&utm_medium=referral&utm_content=DEcSENT/AndroidToolsSample&utm_campaign=Badge_Grade_Dashboard)
[![Build Status](https://travis-ci.org/DEcSENT/AndroidToolsSample.svg?branch=master)](https://travis-ci.org/DEcSENT/AndroidToolsSample)
[![CircleCI](https://circleci.com/gh/DEcSENT/AndroidToolsSample/tree/master.svg?style=svg)](https://circleci.com/gh/DEcSENT/AndroidToolsSample/tree/master)
[![Build Status](https://api.cirrus-ci.com/github/DEcSENT/AndroidToolsSample.svg)](https://cirrus-ci.com/github/DEcSENT/AndroidToolsSample)
[![Build Status](https://app.bitrise.io/app/e920f68a724c7d77/status.svg?token=53c3uzA3vO5MrOdxUWLOGQ&branch=master)](https://app.bitrise.io/app/e920f68a724c7d77)
[![codecov](https://codecov.io/gh/DEcSENT/AndroidToolsSample/branch/master/graph/badge.svg)](https://codecov.io/gh/DEcSENT/AndroidToolsSample)
[![Coverage Status](https://coveralls.io/repos/github/DEcSENT/AndroidToolsSample/badge.svg)](https://coveralls.io/github/DEcSENT/AndroidToolsSample)
[![codebeat badge](https://codebeat.co/badges/18e8650e-a811-482b-af04-b08b6a92d85e)](https://codebeat.co/projects/github-com-decsent-androidtoolssample-master)

## Description

Here will be tools for better application development:

- CI

- Code coverage

- Static analysis

- Helpful plugins, tools

- etc.

## Implemented tools

- **Travis CI**

- **Circle CI**

- **Codecov**

- **Coveralls**

- **Cirrus CI**

- **Bitrise CI** (no config file required)

- **Codebeat** (no config file required)

- [**DexCount plugin**](https://github.com/KeepSafe/dexcount-gradle-plugin)

- [**Detekt**](https://github.com/arturbosch/detekt) (static code analysis for Kotlin)

- [**Hyperion**](https://github.com/willowtreeapps/Hyperion-Android) (app debugging & inspection tool)

- [**Unused Resources Remover**](https://github.com/konifar/gradle-unused-resources-remover-plugin)

## Plugins

- [**ADB Idea**](https://github.com/pbreault/adb-idea)


- [**Key Promoter X**](https://plugins.jetbrains.com/plugin/9792-key-promoter-x)

Shows the user the keyboard short-cuts when a button is pressed with the mouse. This provides an easy way to learn how
to replace tedious mouse work with keyboard keys and helps to transition to a faster, mouse free development.

- [**Statistic**](https://plugins.jetbrains.com/plugin/4509-statistic)

Shows project statistic.

- [**SonarLint**](https://plugins.jetbrains.com/plugin/7973-sonarlint)

SonarLint is an IDE extension that helps you detect and fix quality issues as you write code. 

- [**Gradle version**](https://github.com/ben-manes/gradle-versions-plugin)

Gradle plugin to discover dependency updates.

- [**Grazie**](https://blog.jetbrains.com/idea/2019/11/meet-grazie-the-ultimate-spelling-grammar-and-style-checker-for-intellij-idea/)

This is a plugin for IntelliJ IDEA that provides intelligent checks beyond simple spelling mistakes and typos. It understands grammar rules and can warn you about inappropriate style.

## Other useful tools

- [**Sourcerer**](https://sourcerer.io/)

Sourcerer app makes a visual profile from your GitHub and git repositories.

- [**Mobile Security Framework**](https://github.com/MobSF/Mobile-Security-Framework-MobSF)

Mobile Security Framework is an automated, all-in-one mobile application (Android/iOS/Windows) pen-testing framework capable of performing static analysis, dynamic analysis, malware analysis and web API testing.

- [**ShapeShifter**](https://github.com/alexjlockwood/ShapeShifter)

SVG icon animation tool for Android, iOS, and the web.

- [**Source-pilot**](https://github.com/theapache64/source-pilot)

A chrome extension to enable IDE like file navigation in GitHub.

- [**Android Asset Studio**](https://romannurik.github.io/AndroidAssetStudio/index.html)

A collection of tools to easily generate assets such as launcher icons for your Android app.

## Notes

- Jacoco plugin version lower than 0.8.1 have exception "**NoSuchFieldException: $jacocoAccess**". This was because lower versions don't support Java 10. Was fixed in 0.8.1.

## License

MIT License

Copyright (c) 2018 - 2020 Denis Verentsov

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
