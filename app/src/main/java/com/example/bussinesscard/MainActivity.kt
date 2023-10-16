package com.example.bussinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinesscard.ui.theme.BussinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardContent()
                }
            }
        }
    }
}

@Composable
fun MainContent(
    name: String = stringResource(R.string.full_name),
    title: String = stringResource(R.string.title_job),
    modifier: Modifier = Modifier
) {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .width(110.dp)
                .height(115.dp)
                .background(color = Color(0xFF073042))
            )
        Text(
            text = name,
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = title,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFF006B37)
        )
    }
}

@Composable
fun ContactInfo(
    phoneNumber: String = stringResource(R.string.phone_number),
    socialMedia: String = stringResource(R.string.socmed_ig),
    email: String = stringResource(R.string.email_vina),
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.padding(24.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
        ) {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = "Phone number",
                tint = Color(0xFF006D3B),
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = phoneNumber,
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 12.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
        ) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = "Social media",
                tint = Color(0xFF006D3B),
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = socialMedia,
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 12.dp)
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
        ) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = "Email",
                tint = Color(0xFF006D3B),
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = email,
                fontSize = 14.sp,
                modifier = Modifier.padding(start = 12.dp)
            )
        }
    }
}

@Composable
fun CardContent(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.background(Color(0xFFA5CAA8)).fillMaxSize()
    ) {
        MainContent(modifier = Modifier.weight(1f))
        ContactInfo()
    }
}

@Preview(showBackground = true)
@Composable
fun BussinessPreview() {
    BussinessCardTheme {
        CardContent()
    }
}