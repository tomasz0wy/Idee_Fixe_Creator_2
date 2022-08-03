package tomasz.kopycinski.ideefixecreator2.ui.screens.charactersheetcreator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType
import androidx.hilt.navigation.compose.hiltViewModel
import tomasz.kopycinski.ideefixecreator2.ui.components.TextInput

@Composable
fun CharacterSheetCreator(
    viewModel: CharacterSheetCreatorViewModel = hiltViewModel()
) {
    val uiState = viewModel.uiState

    Column {
        TextInput(
            value = uiState.name,
            onValueChange = { viewModel.changeName(it) }
        )
        TextInput(
            value = uiState.surname,
            onValueChange = { viewModel.changeSurName(it) }
        )
        TextInput(
            value = uiState.age.toString(),
            onValueChange = { viewModel.changeAge(it) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        TextInput(
            value = uiState.gender,
            onValueChange = { viewModel.changeGender(it) }
        )
        TextInput(
            value = uiState.experience.toString(),
            onValueChange = { viewModel.changeExperience(it) },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        TextInput(
            value = uiState.notes,
            onValueChange = { viewModel.changeNotes(it) }
        )
        Button(onClick = { viewModel.saveCharacterSheet() }) {
            Text(text = "Save character sheet")
        }
    }
}
