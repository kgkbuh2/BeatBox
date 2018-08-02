package com.bignerdranch.android.beatbox;

import org.junit.Before;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by cygankovatatana on 02.08.2018.
 */
public class SoundViewModelTest {

    private BeatBox mBeatBox;
    private Sound mSound;
    private SoundViewModel mSubject;

    @Before
    public void setUp() throws Exception {
        mBeatBox = mock(BeatBox.class);
        mSound = new Sound("assetPath");
        mSubject = new SoundViewModel(mBeatBox);
        mSubject.setSound(mSound);
    }

}