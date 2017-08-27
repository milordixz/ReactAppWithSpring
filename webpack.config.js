const path = require('path');
const webpack = require('webpack');

module.exports = {
    entry: path.resolve(__dirname, './frontend/src/app.js'),

    output: {
        path: path.resolve(__dirname, './src/main/resources/static/built'),
        filename: "bundle.js",
        publicPath: "/built/"
    },
    module: {
        rules: [
            {
                test: /\.(js|jsx)$/,
                exclude: /(node_modules|bower_components)/,
                use: [
                    {
                        loader: "babel-loader",
                        options: {
                            cacheDirectory: false,
                            presets: ['es2015', 'react']
                        }
                    }
                ]
            },
            {
                test: /\.less$/,
                use: [
                    {
                        loader: "style-loader"
                    },
                    {
                        loader: "css-loader"
                    },
                    {
                        loader: "less-loader"
                    }
                ]
            },
            {
                test: /\.(jpg|gif|png)$/,
                use: [
                    {
                        loader: "url-loader"
                    }
                ]
            }
        ]
    },
    devServer: {
        port: 9090,
        proxy: {
            '/': {
                target: 'http://localhost:8080',
                secure: false
            }
        }
    },
};