package com.senai.carteirinhadigital.core.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Fonte cursiva do sistema para aproximar o estilo manuscrito da referência.
// Ela é aplicada pelo tema global, portanto vale para todas as telas e botões.
private val Manuscrita = FontFamily.Cursive

val bodyFontFamily = Manuscrita
val displayFontFamily = Manuscrita

private val baseline = Typography()

val AppTypography = Typography(
    displayLarge = baseline.displayLarge.copy(fontFamily = displayFontFamily, fontWeight = FontWeight.Bold, letterSpacing = 0.sp),
    displayMedium = baseline.displayMedium.copy(fontFamily = displayFontFamily, fontWeight = FontWeight.Bold, letterSpacing = 0.sp),
    displaySmall = baseline.displaySmall.copy(fontFamily = displayFontFamily, fontWeight = FontWeight.Bold),
    headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFontFamily, fontWeight = FontWeight.Bold, letterSpacing = 0.sp),
    headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFontFamily, fontWeight = FontWeight.Bold),
    headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFontFamily, fontWeight = FontWeight.Bold),
    titleLarge = baseline.titleLarge.copy(fontFamily = displayFontFamily, fontWeight = FontWeight.Bold, letterSpacing = 0.sp),
    titleMedium = baseline.titleMedium.copy(fontFamily = displayFontFamily, fontWeight = FontWeight.Bold, letterSpacing = 0.sp),
    titleSmall = baseline.titleSmall.copy(fontFamily = displayFontFamily, fontWeight = FontWeight.Bold),
    bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily, letterSpacing = 0.sp),
    bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily, letterSpacing = 0.sp),
    bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily),
    labelLarge = baseline.labelLarge.copy(fontFamily = displayFontFamily, fontWeight = FontWeight.Bold, letterSpacing = 0.sp),
    labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily, fontWeight = FontWeight.Bold),
    labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily)
)
