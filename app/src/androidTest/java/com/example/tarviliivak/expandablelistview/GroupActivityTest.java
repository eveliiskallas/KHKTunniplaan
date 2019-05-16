package com.example.tarviliivak.expandablelistview;

import android.support.test.rule.ActivityTestRule;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class GroupActivityTest {

    @Rule
    public ActivityTestRule<GroupActivity> groupActivityTestRule = new ActivityTestRule<GroupActivity>(GroupActivity.class);

    private GroupActivity groupActivity = null;

    @Before
    public void setUp() throws Exception {

        groupActivity = groupActivityTestRule.getActivity();
    }

    @Test

    public void testLaunch()
    {
        View view = groupActivity.findViewById(R.id.ListView);

        assertNotNull(view);

    }

    @After
    public void tearDown() throws Exception {

        groupActivity = null;
    }

}