package com.example.yusuffinalproject.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.yusuffinalproject.R
import com.example.yusuffinalproject.adapter.QuestionAdapter
import com.example.yusuffinalproject.apiquestions.ApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ApiFragment : Fragment() {
    private lateinit var adapter: QuestionAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_api, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up RecyclerView
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        adapter = QuestionAdapter()
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        // Fetch and display data
        fetchTriviaQuestions()
    }

    private fun fetchTriviaQuestions() {
        lifecycleScope.launch {
            try {
                val questions = withContext(Dispatchers.IO) { ApiClient.service.getQuestions() }
                adapter.submitList(questions)
            } catch (e: Exception) {
                e.printStackTrace() // Handle error (e.g., show a message)
            }
        }
    }
}
