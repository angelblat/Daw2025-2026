param (
    [string]$nombre = "Ejercicio comun XX"
)

$base = "C:\Users\Angel\Documents\Daw 2025-2026\Programacion\Quincena 3"
$proyecto = Join-Path $base $nombre
$subcarpeta = Join-Path $proyecto ($nombre -replace "Ejercicio comun ", "Ejercicio")

# Crear carpeta principal
New-Item -Path $proyecto -ItemType Directory -Force | Out-Null

# Crear subcarpeta del proyecto
New-Item -Path $subcarpeta -ItemType Directory -Force | Out-Null

# Crear archivo README.md vacío en la carpeta principal
New-Item -Path (Join-Path $proyecto "README.md") -ItemType File -Force | Out-Null

Write-Host "Proyecto creado: $proyecto"
Write-Host "Subcarpeta: $subcarpeta"
Write-Host "README.md añadido para evitar subcarpeta visible en GitHub"
