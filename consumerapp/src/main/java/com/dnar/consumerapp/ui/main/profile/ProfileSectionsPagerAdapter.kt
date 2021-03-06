package com.dnar.consumerapp.ui.main.profile

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.dnar.consumerapp.R
import com.dnar.consumerapp.data.model.UserDetail
import com.dnar.consumerapp.ui.main.profile.follow.ProfileFollowFragment

// ProfileSectionsPagerAdapter implements FragmentPagerAdapter
class ProfileSectionsPagerAdapter(
    fm: FragmentManager,
    context: Fragment,
    private val username: String,
    private val user: UserDetail?
) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val tabTittles = listOf(
        context.getString(R.string.profile_follower),
        context.getString(R.string.profile_following)
    )

    override fun getItem(position: Int): Fragment =
        ProfileFollowFragment.newInstance(position, username, user)

    override fun getPageTitle(position: Int): CharSequence? =
        tabTittles[position]

    override fun getCount(): Int = tabTittles.size
}