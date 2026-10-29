package com.senai.carteirinhadigital.feature.aluno.unidadescurriculares.presentation.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.senai.carteirinhadigital.feature.aluno.unidadescurriculares.domain.model.UnidadeCurricular

@Composable
fun UnidadeCurricularCard(
    modifier: Modifier = Modifier,
    unidadeCurricular: UnidadeCurricular
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            // Paleta inspirada no clima tropical de Bob Esponja, sem personagens.
            containerColor = Color(0xFFFFF4C7)
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = unidadeCurricular.nome,
                style = MaterialTheme.typography.titleLarge,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF4A321D)
            )
            Text(
                text = "Professor: ${unidadeCurricular.professor}",
                style = MaterialTheme.typography.bodyMedium,
                fontFamily = FontFamily.Cursive,
                color = Color(0xFF315D68)
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "N1: ${unidadeCurricular.nota1}",
                    fontFamily = FontFamily.Cursive,
                    color = Color(0xFF174D66)
                )
                Text(
                    text = "N2: ${unidadeCurricular.nota2}",
                    fontFamily = FontFamily.Cursive,
                    color = Color(0xFF174D66)
                )
                Text(
                    text = "Média: ${unidadeCurricular.media}",
                    fontFamily = FontFamily.Cursive,
                    color = Color(0xFF174D66)
                )
            }
            Text(
                text = "Faltas: ${unidadeCurricular.faltas}",
                style = MaterialTheme.typography.bodyMedium,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Medium,
                color = Color(0xFFE78A18)
            )
        }
    }
}
@Preview(
    showBackground = true
)
@Composable
fun UnidadeCurricularCardPreview() {
    UnidadeCurricularCard(
        unidadeCurricular = UnidadeCurricular(
            id = "1",
            nome = "Matemática",
            professor = "Dr. Silva",
            nota1 = 8.5,
            nota2 = 7.0,
            media = 7.75,
            faltas = 2
        )
    )
}
