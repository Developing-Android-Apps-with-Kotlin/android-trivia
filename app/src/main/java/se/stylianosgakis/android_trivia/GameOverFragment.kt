package se.stylianosgakis.android_trivia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import se.stylianosgakis.android_trivia.databinding.FragmentGameOverBinding

class GameOverFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentGameOverBinding =
            DataBindingUtil.inflate(
                inflater, R.layout.fragment_game_over, container, false
            )
        binding.tryAgainButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                GameOverFragmentDirections.actionGameOverFragmentToGameFragment()
            )
        )
        return binding.root
    }
}
