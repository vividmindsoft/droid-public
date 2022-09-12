ext {
    toolVersions = [
            kotlin    : '1.7.0',
            compileSdk: 32,
            targetSdk : 32,
            minSdk    : 21,
            buildTools: '32.0.0'
    ]
    coreLibVersions = [   
            navigation              : '2.5.1',
            compose                 : '1.2.0',
            toothpick               : '3.1.0',
            toothpickSmoothie       : '3.1.0',
            retrofit                : '2.9.0',
            threeten                : '1.4.0',
            fragment                : '1.5.1',
            lifecycle               : '2.5.0-beta01',
            okhttp                  : '5.0.0-alpha.3',
            rxActivityResult        : '2.2.1',
            room                    : '2.4.2' 
    ]
    testingLibVersions = [
            mockk                   : '1.12.3',
            espresso                : '3.4.0',
            robolectric             : '4.8.1'
    ]
}